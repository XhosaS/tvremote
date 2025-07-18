package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gxy {
    public final String a;
    public final long[] b;
    public final ArrayList c;
    public final ArrayList d;
    public boolean e;
    public boolean f;
    public gxx g;
    public int h;
    final /* synthetic */ gyb i;

    public gxy(gyb gybVar, String str) {
        str.getClass();
        this.i = gybVar;
        this.a = str;
        this.b = new long[2];
        this.c = new ArrayList(2);
        this.d = new ArrayList(2);
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i = 0; i < 2; i++) {
            sb.append(i);
            this.c.add(this.i.a.g(sb.toString()));
            sb.append(".tmp");
            this.d.add(this.i.a.g(sb.toString()));
            sb.setLength(length);
        }
    }

    public final void a(zgl zglVar) {
        int i = 0;
        while (true) {
            long[] jArr = this.b;
            if (i >= 2) {
                return;
            }
            long j = jArr[i];
            zglVar.W(32);
            zglVar.Y(j);
            i++;
        }
    }

    public final void b() {
        this.e = true;
    }

    public final void c() {
        this.f = true;
    }
}
