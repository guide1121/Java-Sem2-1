public class Ironman extends Superhero implements SkillHero{
    
    private String skill;
    public void skill(String skill){
        this.skill = skill;
    }

    @Override
    public void moving(String moving) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void jumping(String jumping) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void weapon(String weapon) {
        // TODO Auto-generated method stub
        
    }
    
    @Override
    public String toString(){
        return super.toString() + " Skill: " + this.skill; 
    }

}
