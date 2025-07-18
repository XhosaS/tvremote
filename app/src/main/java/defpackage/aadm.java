package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aadm extends aaer {
    public final aads a;
    public final aagf b;

    private aadm(aads aadsVar, aagf aagfVar) {
        this.a = aadsVar;
        this.b = aagfVar;
    }

    public static aadm a(aads aadsVar, aagf aagfVar) throws GeneralSecurityException {
        if (aadsVar.a.intValue() == aagfVar.a.a.length) {
            return new aadm(aadsVar, aagfVar);
        }
        throw new GeneralSecurityException("Key size mismatch");
    }
}
