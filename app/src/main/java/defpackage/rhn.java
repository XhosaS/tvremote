package defpackage;

import java.io.File;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rhn {
    public final zkl a = zkl.e;
    private final yrp b;
    private final yrp c;

    public rhn(final abvo abvoVar, final String str, final String str2) {
        this.b = yru.a(new yrp() { // from class: rhl
            @Override // defpackage.yrp
            public final Object eV() {
                byte[] bArrB = abvoVar.B();
                return this.a.a.k(bArrB, bArrB.length);
            }
        });
        this.c = yru.a(new yrp() { // from class: rhm
            @Override // defpackage.yrp
            public final Object eV() {
                int i = zjr.b;
                int i2 = zjw.a;
                zjv zjvVar = new zjv();
                byte[] bytes = str.getBytes();
                zjvVar.d(bytes, bytes.length);
                zjvVar.a.put((byte) 0);
                zjvVar.h();
                byte[] bytes2 = str2.getBytes();
                zjvVar.d(bytes2, bytes2.length);
                byte[] bArrD = zjvVar.n().d();
                return this.a.a.k(bArrD, bArrD.length);
            }
        });
    }

    public final File a() {
        return new File(((String) this.b.eV()) + "/" + ((String) this.c.eV()) + ".pb");
    }
}
