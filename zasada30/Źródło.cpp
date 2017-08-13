#include <iostream>

using namespace std;

void zasada30(int *tablica, int rozmiar, int ilosc_krokow)
{
	for (int i = 0; i < ilosc_krokow; i++)
	{
		for (int j = 0; j < rozmiar; j++)
		{
			if (tablica[j] == 1)
				cout << "*";
			else
				cout << " ";
		}
		cout << endl;

		int *pomoc = new int[rozmiar];
		for (int j = 0; j < rozmiar; j++)
			pomoc[j] = 0;

		for (int j = 0; j < rozmiar; j++)
		{
			if (j != 0 && j != rozmiar - 1)
			{
				if (tablica[j - 1] == 1 && tablica[j] == 1 && tablica[j + 1] == 1)
					pomoc[j] = 0;
				if (tablica[j - 1] == 1 && tablica[j] == 1 && tablica[j + 1] == 0)
					pomoc[j] = 0;
				if (tablica[j - 1] == 1 && tablica[j] == 0 && tablica[j + 1] == 1)
					pomoc[j] = 0;
				if (tablica[j - 1] == 1 && tablica[j] == 0 && tablica[j + 1] == 0)
					pomoc[j] = 1;
				if (tablica[j - 1] == 0 && tablica[j] == 1 && tablica[j + 1] == 1)
					pomoc[j] = 1;
				if (tablica[j - 1] == 0 && tablica[j] == 1 && tablica[j + 1] == 0)
					pomoc[j] = 1;
				if (tablica[j - 1] == 0 && tablica[j] == 0 && tablica[j + 1] == 1)
					pomoc[j] = 1;
				if (tablica[j - 1] == 0 && tablica[j] == 0 && tablica[j + 1] == 0)
					pomoc[j] = 0;
			}
			else if (j == 0)
			{
				if (tablica[j] == 1 && tablica[j + 1] == 1)
					pomoc[j] = 1;
				if (tablica[j] == 0 && tablica[j + 1] == 1)
					pomoc[j] = 1;
				if (tablica[j] == 1 && tablica[j + 1] == 0)
					pomoc[j] = 1;
				if (tablica[j] = 0 && tablica[j + 1] == 0)
					pomoc[j] = 0;
			}
			else if (j == rozmiar - 1)
			{
				if (tablica[j] == 1 && tablica[j - 1] == 1)
					pomoc[j] = 0;
				if (tablica[j] == 0 && tablica[j - 1] == 1)
					pomoc[j] = 1;
				if (tablica[j] == 1 && tablica[j - 1] == 0)
					pomoc[j] = 1;
				if (tablica[j] == 0 && tablica[j - 1] == 0)
					pomoc[j] = 0;


			}

		}

		for (int j = 0; j < rozmiar; j++)
			tablica[j] = pomoc[j];
	}

}


int main() {

	int rozmiar = 40;
	int ilosc_krokow = 10;
	int *tablica = new int[rozmiar];

	for (int i = 0; i < rozmiar; i++)
		tablica[i] = 0;

	tablica[rozmiar / 2] = 1;
	zasada30(tablica, rozmiar, ilosc_krokow);




	system("PAUSE");
	return 0;
}