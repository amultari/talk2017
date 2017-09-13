package it.prova.multicatch;

public class MultiCatch {

	public void methodThatThrowsThreeExceptions() throws ExceptionOne, ExceptionTwo, ExceptionThree {

	}

	public void showUseJava6() {
		try {

			methodThatThrowsThreeExceptions();

		} catch (ExceptionOne e) {

			// log and deal with ExceptionOne

		} catch (ExceptionTwo e) {

			// log and deal with ExceptionTwo

		} catch (ExceptionThree e) {

			// log and deal with ExceptionThree

		}
	}
	
	public void showUseJava7(){
		 try{

             methodThatThrowsThreeExceptions();

       } catch(ExceptionOne | ExceptionTwo | ExceptionThree e) {

             // log and deal with all Exceptions

       }
	}
	
	
	//si può anche optare per una diversa suddivisione ma in genere lo si fa solo se ExceptionOne
	//appartiene ad un'altra gerarchia
	
	public void showUseJava7_2(){
		 try{

             methodThatThrowsThreeExceptions();

       } catch(ExceptionOne e) {

             // log and deal with ExceptionOne

       } catch(ExceptionTwo | ExceptionThree e) {

             // log and deal with ExceptionTwo and ExceptionThree

       }
	}

}
