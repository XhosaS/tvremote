package defpackage;

import android.graphics.Typeface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class arn {
    public final btp a;
    public final char[] b;
    public final arm c;
    public final Typeface d;

    arn() {
        this.d = Typeface.DEFAULT;
        this.a = null;
        this.c = new arm(1024);
        this.b = new char[0];
    }

    public arn(Typeface typeface, btp btpVar) {
        this.d = typeface;
        this.a = btpVar;
        this.c = new arm(1024);
        int iA = btpVar.a();
        this.b = new char[iA + iA];
        int iA2 = btpVar.a();
        for (int i = 0; i < iA2; i++) {
            aqz aqzVar = new aqz(this, i);
            Character.toChars(aqzVar.a().c(), this.b, i + i);
            afk.a(aqzVar.a().b() > 0, "invalid metadata codepoint length");
            this.c.b(aqzVar, 0, aqzVar.a().b() - 1);
        }
    }
}
