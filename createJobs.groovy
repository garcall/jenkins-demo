pipelineJob('theme-park-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/garcall/spring-boot-api-example.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}
