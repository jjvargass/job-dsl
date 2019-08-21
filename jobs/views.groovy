listView('project-python') {
    description('All stable jobs for propython')
    jobs {
        regex(/.*python.*/)
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}