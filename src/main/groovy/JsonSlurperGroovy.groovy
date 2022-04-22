import groovy.json.JsonSlurper

class JsonSlurperGroovy {
    static void main(String[] args) {
        def jsonSlurper = new JsonSlurper();
        String jsonText = "{\n" +
                "  \"count\": 20,\n" +
                "  \"teams\": [\n" +
                "    {\n" +
                "      \"id\": 322,\n" +
                "      \"name\": \"Hull City FC\",\n" +
                "      \"shortName\": \"Hull\",\n" +
                "      \"squadMarketValue\": null,\n" +
                "      \"crestUrl\": \"http://upload.wikimedia.org/wikipedia/de/a/a9/Hull_City_AFC.svg\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 338,\n" +
                "      \"name\": \"Leicester City FC\",\n" +
                "      \"shortName\": \"Foxes\",\n" +
                "      \"squadMarketValue\": null,\n" +
                "      \"crestUrl\": \"http://upload.wikimedia.org/wikipedia/en/6/63/Leicester02.png\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 340,\n" +
                "      \"name\": \"Southampton FC\",\n" +
                "      \"shortName\": \"Southampton\",\n" +
                "      \"squadMarketValue\": null,\n" +
                "      \"crestUrl\": \"http://upload.wikimedia.org/wikipedia/de/c/c9/FC_Southampton.svg\"\n" +
                "    }\n" +
                "  ]\n" +
                "}\n";
        def obj = jsonSlurper.parseText(jsonText);
        def dataforTeam = obj.teams.find { it.name == 'Leicester City FC' };
        println(dataforTeam);
        def countOfTeams = obj.count;
        println(countOfTeams);
    }
}
