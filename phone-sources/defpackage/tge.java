package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tge {
    public int a;
    public int b;
    public tgg c;
    public int d;
    public int e;
    public tgh f;

    public final tgg a() {
        tgg tggVar = this.c;
        this.c = null;
        return tggVar;
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        tgg tggVar = this.c;
        int i3 = this.d;
        int i4 = this.e;
        StringBuilder sb = new StringBuilder("FillState{mHeightFilled=");
        sb.append(i);
        sb.append(",mNextAnchorPosition=");
        sb.append(i2);
        sb.append(",mNextItem=");
        sb.append(tggVar == null ? "null" : "notnull");
        sb.append(",mNextItemPosition=");
        sb.append(i3);
        sb.append(",mNextItemChildIndex=");
        sb.append(i4);
        return sb.toString();
    }
}
