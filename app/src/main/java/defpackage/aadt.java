package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aadt extends aaer {
    public final aaeb a;
    public final aagf b;

    private aadt(aaeb aaebVar, aagf aagfVar) {
        this.a = aaebVar;
        this.b = aagfVar;
    }

    public static aadt a(aaeb aaebVar, aagf aagfVar) throws GeneralSecurityException {
        if (aaebVar.a.intValue() == aagfVar.a.a.length) {
            return new aadt(aaebVar, aagfVar);
        }
        throw new GeneralSecurityException("Key size mismatch");
    }
}
