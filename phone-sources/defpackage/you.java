package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class you extends yid implements yqz {
    public static final bbx b = new bbx();
    public final long a;

    public you(long j) {
        super(b);
        this.a = j;
    }

    @Override // defpackage.yqz
    public final /* bridge */ /* synthetic */ Object eI(yil yilVar) {
        yov yovVar = (yov) yilVar.get(yov.b);
        String str = yovVar != null ? yovVar.a : "coroutine";
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        int iAf = ylh.af(name, " @");
        if (iAf < 0) {
            iAf = name.length();
        }
        StringBuilder sb = new StringBuilder(str.length() + iAf + 10);
        String strSubstring = name.substring(0, iAf);
        strSubstring.getClass();
        sb.append(strSubstring);
        sb.append(" @");
        sb.append(str);
        sb.append('#');
        sb.append(this.a);
        threadCurrentThread.setName(sb.toString());
        return name;
    }

    @Override // defpackage.yqz
    public final /* bridge */ /* synthetic */ void eJ(Object obj) {
        Thread.currentThread().setName((String) obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof you) && this.a == ((you) obj).a;
    }

    public final int hashCode() {
        return a.k(this.a);
    }

    public final String toString() {
        return "CoroutineId(" + this.a + ")";
    }
}
