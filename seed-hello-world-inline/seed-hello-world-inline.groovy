job('seed-inline-job') {
  steps {
    dsl {
      text("""
        job('hello-world-seedet') {
          steps {
            shell('echo Hello, World!')
          }
        }""")
    }
  }
}
