
lazy val tenseiDeveloperGuide = project.in(file("."))
  .settings(
    organization := "com.wegtam.tensei",
    organizationName := "Wegtam GmbH",
    name := "tensei-developer-guide",
    git.useGitDescribe := true,
    ghpagesNoJekyll := true,
    git.remoteRepo := "git@github.com:Tensei-Data/developer-guide.git"
  )
  .enablePlugins(
    AsciidoctorPlugin,
    GitBranchPrompt,
    GitVersioning,
    GhpagesPlugin
  )

