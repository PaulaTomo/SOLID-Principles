package org.example.SolidPrinciples;

// TODO: Interfaces Segregation:
/*Interfetele mai mari ar trebui impartite in altele mai mici astfel incat sa ne putem asigura ca
implementarea claselor trebuie preocupata doar de metodele care sunt de interes pentru ele
*/
public interface Drive  {
public boolean startEngine();
public boolean accelerate (int speed);
public boolean stopEngine();
}
