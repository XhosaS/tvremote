package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aarn {
    public static aaif a(String str, String str2) {
        return aaif.c(new aarg(str, str2), aark.class);
    }

    public static aaif b(final String str, final aarm aarmVar) {
        aaie aaieVarB = aaif.b(aark.class);
        aaieVarB.b = 1;
        aaieVarB.b(new aaiw(new aajj(aaji.class, Context.class), 1, 0));
        aaieVarB.c = new aaik() { // from class: aarl
            @Override // defpackage.aaik
            public final Object a(aaih aaihVar) {
                return new aarg(str, aarmVar.a((Context) aaihVar.e(Context.class)));
            }
        };
        return aaieVarB.a();
    }
}
