package rest.server.db

databaseChangeLog(physicalFilePath: 'changelog-1.0.groovy') {

    changeSet(id: '2015-06-22-00', author: 'andrei_kuzniatsou') {
        comment("Create 'user' table")

        createTable(tableName: 'user', remarks: 'Test table.') {
            column(name: 'user_uid', type: 'VARCHAR(128)')
            column(name: 'user_name', type: 'VARCHAR(128)')
            column(name: 'user_surname', type: 'VARCHAR(128)')
            column(name: 'email', type: 'VARCHAR(128)')

        }
        addPrimaryKey(schemaName: 'public', tableName: 'user', tablespace: 'pg_default', columnNames: 'user_uid', constraintName: 'PK_user')
        rollback {
            dropTable(tableName: "user")
        }
    }

}