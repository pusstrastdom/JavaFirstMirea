package ru.mirea.task4.task4_1.num4;

public class Matrix {
    private double[][] data;
    private int rows;
    private int columns;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.data = new double[rows][columns];
    }

    public void set(int row, int column, double value) {
        if (row >= 0 && row < rows && column >= 0 && column < columns) {
            data[row][column] = value;
        } else {
            System.out.println("Недопустимые индексы строки или столбца");
        }
    }

    public Matrix add(Matrix other) {
        if (this.rows != other.rows || this.columns != other.columns) {
            System.out.println("Невозможно сложить матрицы разных размеров");
            return null;
        }

        Matrix result = new Matrix(this.rows, this.columns);

        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                result.data[i][j] = this.data[i][j] + other.data[i][j];
            }
        }

        return result;
    }

    public Matrix multiplyByScalar(double scalar) {
        Matrix result = new Matrix(this.rows, this.columns);

        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                result.data[i][j] = this.data[i][j] * scalar;
            }
        }

        return result;
    }

    public void print() {
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }

    public Matrix multiply(Matrix other) {
        if (this.columns != other.rows) {
            System.out.println("Невозможно умножить матрицы с данными размерами");
            return null;
        }

        Matrix result = new Matrix(this.rows, other.columns);

        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < other.columns; j++) {
                double sum = 0;
                for (int k = 0; k < this.columns; k++) {
                    sum += this.data[i][k] * other.data[k][j];
                }
                result.data[i][j] = sum;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(2, 3);
        matrix1.set(0, 0, 1);
        matrix1.set(0, 1, 2);
        matrix1.set(0, 2, 3);
        matrix1.set(1, 0, 4);
        matrix1.set(1, 1, 5);
        matrix1.set(1, 2, 6);

        Matrix matrix2 = new Matrix(2, 3);
        matrix2.set(0, 0, 7);
        matrix2.set(0, 1, 8);
        matrix2.set(0, 2, 9);
        matrix2.set(1, 0, 10);
        matrix2.set(1, 1, 11);
        matrix2.set(1, 2, 12);

        System.out.println("Матрица 1:");
        matrix1.print();

        System.out.println("Матрица 2:");
        matrix2.print();

        System.out.println("Сумма матриц:");
        Matrix sumResult = matrix1.add(matrix2);
        if (sumResult != null) {
            sumResult.print();
        }

        System.out.println("Умножение матрицы 1 на 2.5:");
        Matrix scalarResult = matrix1.multiplyByScalar(2.5);
        scalarResult.print();

        System.out.println("Умножение матрицы 1 на матрицу 2:");
        Matrix multiplyResult = matrix1.multiply(matrix2);
        if (multiplyResult != null) {
            multiplyResult.print();
        }
    }
}