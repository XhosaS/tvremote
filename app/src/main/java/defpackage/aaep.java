package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aaep {
    private static final aaao a = b();

    public static zzm a() throws GeneralSecurityException {
        if (aaaf.a()) {
            throw new GeneralSecurityException("Cannot use non-FIPS-compliant StreamingAead in FIPS mode");
        }
        return a;
    }

    private static aaao b() {
        try {
            aabu aabuVar = new aabu();
            aabuVar.b(aaeu.a);
            aabuVar.a(new aabq(aadt.class, zzy.class, new aabr() { // from class: aaen
                @Override // defpackage.aabr
                public final Object a(zzn zznVar) {
                    return new aafg((aadt) zznVar);
                }
            }));
            aabuVar.a(new aabq(aadm.class, zzy.class, new aabr() { // from class: aaeo
                @Override // defpackage.aabr
                public final Object a(zzn zznVar) {
                    return new aafd((aadm) zznVar);
                }
            }));
            return new aaan(new aabw(aabuVar));
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
