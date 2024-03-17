rootProject.name = "mts-hw-leonov"
include("src:main:HW1")
findProject(":src:main:HW1")?.name = "HW1"
include("src:HW2")
findProject(":src:HW2")?.name = "HW2"
