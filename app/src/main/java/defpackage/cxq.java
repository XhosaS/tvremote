package defpackage;

import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cxq {
    private final Parcelable a;
    private final CharSequence b;
    private final boolean c;

    public cxq(Parcelable parcelable, CharSequence charSequence, boolean z) {
        this.a = parcelable;
        this.b = charSequence;
        this.c = z;
    }

    public final cxl a(cxk cxkVar) {
        Parcelable parcelable = this.a;
        aff.a(parcelable, "Action must be non-null");
        cxkVar.b("shortcut");
        cxk cxkVar2 = new cxk(cxkVar);
        CharSequence charSequence = this.b;
        if (charSequence != null) {
            cxkVar2.e(charSequence, "title");
        }
        if (this.c) {
            cxkVar2.b("selected");
        }
        cxl cxlVarA = cxkVar2.a();
        parcelable.getClass();
        cxkVar.a.add(new cxm(new afg(parcelable, cxlVarA), "action", "toggle", cxlVarA.d));
        return cxkVar.a();
    }
}
