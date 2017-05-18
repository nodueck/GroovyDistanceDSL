import model.DistanceCategory

use(DistanceCategory.class){
	Script script = new GroovyShell().parse( new File( 'resources/externalScript.groovy' ) )
	def result = script.run()
	println result
}
