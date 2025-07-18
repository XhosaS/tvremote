package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class otg {
    public int a;
    public int b;
    public oti c;
    public int d;
    public int e;
    public otj f;

    public final oti a() {
        oti otiVar = this.c;
        this.c = null;
        return otiVar;
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        oti otiVar = this.c;
        int i3 = this.d;
        int i4 = this.e;
        StringBuilder sb = new StringBuilder("FillState{mHeightFilled=");
        sb.append(i);
        sb.append(",mNextAnchorPosition=");
        sb.append(i2);
        sb.append(",mNextItem=");
        sb.append(otiVar == null ? "null" : "notnull");
        sb.append(",mNextItemPosition=");
        sb.append(i3);
        sb.append(",mNextItemChildIndex=");
        sb.append(i4);
        return sb.toString();
    }
}
