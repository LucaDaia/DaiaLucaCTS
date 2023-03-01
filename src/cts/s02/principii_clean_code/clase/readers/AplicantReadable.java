package cts.s02.principii_clean_code.clase.readers;

import cts.s02.principii_clean_code.clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;

public interface AplicantReadable {
    List<Aplicant> readAplicant(String fileName) throws FileNotFoundException;
}
