package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fmy {
    public static final byte[] a = {0, 0, 0, 0, 16, 0, Byte.MIN_VALUE, 0, 0, -86, 0, 56, -101, 113};
    public static final byte[] b = {0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};

    public static boolean a(fdq fdqVar) {
        edi ediVar = new edi(8);
        int i = aacv.b(fdqVar, ediVar).a;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        fdqVar.i(ediVar.a, 0, 4);
        ediVar.K(0);
        int iE = ediVar.e();
        if (iE == 1463899717) {
            return true;
        }
        edb.c("WavHeaderReader", a.cf(iE, "Unsupported form type: "));
        return false;
    }

    public static aacv b(int i, fdq fdqVar, edi ediVar) throws eaf {
        aacv aacvVarB = aacv.b(fdqVar, ediVar);
        while (true) {
            int i2 = aacvVarB.a;
            if (i2 == i) {
                return aacvVarB;
            }
            edb.e("WavHeaderReader", a.cf(i2, "Ignoring unknown WAV chunk: "));
            long j = aacvVarB.b;
            long j2 = 8 + j;
            if ((1 & j) != 0) {
                j2 = 9 + j;
            }
            if (j2 > 2147483647L) {
                throw new eaf(a.cf(i2, "Chunk is too large (~2GB+) to skip; id: "), null, false, 1);
            }
            fdqVar.l((int) j2);
            aacvVarB = aacv.b(fdqVar, ediVar);
        }
    }
}
