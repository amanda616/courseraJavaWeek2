
/**
 * Find first instance of ATG in a strand of DNA, find first occurance of TAA after ATG,  * 
 * check if Gene is divisable by 3 and therefore a true gene. test code using void testFindSimpleGene.
 * @AmandaVasquez
 * @7/07/17
 */
public class findSimpleGeneAndTest {

    public String findSimpleGene(String dna) {
        String result = "";
        int startIndex = dna.indexOf("ATG");//start codon is ATG 
            if( startIndex == -1){ //If there is no ATG return empty srting
                return ""; 
            }         
        int stopIndex = dna.indexOf("TAA", startIndex+3); //stop codon is TAA
            if( stopIndex ==-1){ //If there is no TAA return empty srting
                return "";
            }
            if ((stopIndex+3)-startIndex %3 != 0){ //Test that gene divisable by 3; a true gene
               return "";
            }
        result = dna.substring(startIndex, stopIndex+3);
        return result;
    }
    
    public void testFindSimpleGene(){
        String dna = "AATGCGTAATATGGT";
        System.out.println("DNA strand is " + dna);
        String gene = findSimpleGene(dna);
        System.out.println("Gene is "+gene);
    
        dna = "AATGCTAGGGTAATATGGT";
        System.out.println("DNA strand is " + dna);
        gene = findSimpleGene(dna);
        System.out.println("Gene is "+ gene);
    
        dna = "ATCCTATGCTTCGGCTGCTCTAATATGGT";
        System.out.println("DNA strand is " + dna);
        gene = findSimpleGene(dna);
        System.out.println("Gene is " + gene);
    
        dna = "ATGTAA";
        System.out.println("DNA strand is " + dna);
        gene = findSimpleGene(dna);
        System.out.println("Gene is " + gene);
       
    }
}