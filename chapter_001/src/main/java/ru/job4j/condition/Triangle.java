package ru.job4j.condition;

public class Triangle {
	private Point a;
	private Point b;
	private Point c;
	
	public Triangle(Point a, Point b, Point c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	/**
	 * Метод вычисления полупериметра по длинам сторон.
	 *
	 * Формула.
	 *
	 * (ab + ac + bc) / 2
	 *
	 * @param ab расстояние между точками ab
	 * @param ac расстояние между точками ac
	 * @param bc расстояние между точками bc
	 * @return Периметр.
	 */
	public double period(double ab, double ac, double bc) {
		 return (ab + ac + bc) / 2;
	}
	 
	/**
	 * Метод вычисления площади треугольника.
	 *
	 * @return Площадь, если труегольник существует, -1 - если треугольника нет.
	 */
	public double area() {
		double rsl = -1;
		double ab = this.a.distanceTo(this.b);
		double ac = this.a.distanceTo(this.c);
		double bc = this.b.distanceTo(this.c);
		double p = this.period(ab, ac, bc);
		if (this.exist(ab, ac, bc)) {
			rsl = Math.sqrt(p * (p - ab) * (p - ac) * (p - bc));
		} else {
			rsl = -1;
		}
		return rsl;
	}
	
	/**
	 * Метод проверяет, можно ли построить треугольник с такими длинами сторон.
	 *
	 * усл
	 *
	 * @param ab Длина от точки ab.
	 * @param ac Длина от точки ac.
	 * @param bc Длина от точки bc.
	 * @return 
	 */
	private boolean exist(double ab, double ac, double bc) {
		return (ab > 0 || ac > 0 || bc > 0);
	}
}