environments {
    dev {
        jdbc {
            url = 'dev_ip'
            user = 'dev_user'
            password = 'dev_pwd'
        }
    }

    test {
        jdbc {
            url = 'test_ip'
            user = 'test_user'
            password = 'test_pwd'
        }
    }

    prd {
        jdbc {
            url = 'prd_ip'
            user = 'prd_user'
            password = 'prd_pwd'
        }
    }
}