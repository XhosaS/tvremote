package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wfm {
    public String a;
    public Function b;
    public Function c;
    public boolean d;
    public Function e;
    public Function f;
    public Function g;
    public Function h;
    public Function i;
    public Function j;

    public final wfn a() {
        Function function = this.f;
        if (function == null && this.g != null) {
            throw new IllegalArgumentException("Color " + this.a + " has secondBackground defined, but background is not defined.");
        }
        if (function == null && this.h != null) {
            throw new IllegalArgumentException("Color " + this.a + " has contrastCurve defined, but background is not defined.");
        }
        if (function != null && this.h == null) {
            throw new IllegalArgumentException("Color " + this.a + " has background defined, but contrastCurve is not defined.");
        }
        String str = this.a;
        Function function2 = this.b;
        Function functionF = this.c;
        if (functionF == null) {
            functionF = wfn.f(function);
        }
        return new wfn(str, function2, functionF, this.d, this.e, function, this.g, this.h, this.i, this.j);
    }

    public final wfm b(wfn wfnVar) {
        String str = this.a;
        Object obj = wfnVar.b;
        int i = 2;
        if (!str.equals(obj)) {
            throw new IllegalArgumentException("Attempting to extend color " + this.a + " with color " + ((String) obj) + " of different name for spec version " + wcq.C(2) + ".");
        }
        boolean z = this.d;
        boolean z2 = wfnVar.a;
        if (z == z2) {
            wfm wfmVar = new wfm();
            wfmVar.a = this.a;
            wfmVar.d = z;
            wfmVar.b = new wfl(this, wfnVar, 0);
            wfmVar.c = new wfl(this, wfnVar, i);
            wfmVar.e = new wfl(this, wfnVar, 3);
            wfmVar.f = new wfl(this, wfnVar, 4);
            wfmVar.g = new wfl(this, wfnVar, 5);
            wfmVar.h = new wfl(this, wfnVar, 6);
            wfmVar.i = new wfl(this, wfnVar, 7);
            wfmVar.j = new wfl(this, wfnVar, 8);
            return wfmVar;
        }
        String str2 = this.a;
        String strC = wcq.C(2);
        StringBuilder sb = new StringBuilder("Attempting to extend color ");
        sb.append(str2);
        sb.append(" as a ");
        sb.append(true != z ? "foreground" : "background");
        sb.append(" with color ");
        sb.append((String) obj);
        sb.append(" as a ");
        sb.append(true == z2 ? "background" : "foreground");
        sb.append(" for spec version ");
        sb.append(strC);
        sb.append(".");
        throw new IllegalArgumentException(sb.toString());
    }
}
