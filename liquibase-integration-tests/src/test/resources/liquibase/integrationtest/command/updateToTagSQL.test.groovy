package liquibase.integrationtest.command

CommandTest.define {
    command = ["updateToTagSQL"]

    run {
        arguments = [
                tag          : "version_2.0",
                changeLogFile: "changelogs/hsqldb/complete/simple.tag.changelog.xml",
        ]

        expectedResults = [
                statusMessage: "Successfully executed updateToTagSQL",
                statusCode   : 0
        ]
    }
}
