package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nal implements lhf {
    public final String a;
    public final kxe b;
    public final boolean c;
    public final View d;
    public final lio e;

    public nal() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nal) {
            nal nalVar = (nal) obj;
            if (this.a.equals(nalVar.a) && this.b.equals(nalVar.b) && this.c == nalVar.c && this.d.equals(nalVar.d)) {
                if (((lif) this.e).e(nalVar.e)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ this.d.hashCode()) * 1000003) ^ ((lif) this.e).a();
    }

    public final String toString() {
        lio lioVar = this.e;
        View view = this.d;
        return "ThumbdownClickEvent{title=" + this.a + ", userSentiment=" + this.b.toString() + ", isRestricted=" + this.c + ", view=" + view.toString() + ", thumbdownNode=" + lioVar.toString() + "}";
    }

    public nal(String str, kxe kxeVar, boolean z, View view, lio lioVar) {
        if (str == null) {
            throw new NullPointerException("Null title");
        }
        this.a = str;
        if (kxeVar == null) {
            throw new NullPointerException("Null userSentiment");
        }
        this.b = kxeVar;
        this.c = z;
        if (view == null) {
            throw new NullPointerException("Null view");
        }
        this.d = view;
        this.e = lioVar;
    }
}
