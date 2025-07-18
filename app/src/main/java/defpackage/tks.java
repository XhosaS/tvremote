package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class tks {
    public static final tko b = new tko();
    public static final zdy c = zdy.h("com/google/android/libraries/search/rendering/xuikit/elements/logging/XUiKitVe");
    public final acxn d;

    public tks(acxn acxnVar) {
        this.d = acxnVar;
    }

    public Integer a(int i) {
        return null;
    }

    public boolean b(int i) {
        return false;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof tks) && ((tks) obj).d.d == this.d.d;
    }

    public final int hashCode() {
        return this.d.d;
    }

    public String toString() {
        acxn acxnVar = this.d;
        return "XUiKitVe(nodeId=" + acxnVar.d + ", parentNodeId=" + acxnVar.e + ")";
    }
}
