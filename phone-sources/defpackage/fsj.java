package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fsj {
    public long a;
    public long b;
    public int c;
    public CharSequence d;
    public long e;
    public Bundle f;
    private final List g;
    private int h;
    private long i;
    private float j;
    private long k;

    public fsj() {
        this.g = new ArrayList();
        this.e = -1L;
    }

    public final fsl a() {
        return new fsl(this.h, this.i, this.a, this.j, this.b, this.c, this.d, this.k, this.g, this.e, this.f);
    }

    public final void b(int i, long j, float f, long j2) {
        this.h = i;
        this.i = j;
        this.k = j2;
        this.j = f;
    }

    public fsj(fsl fslVar) {
        ArrayList arrayList = new ArrayList();
        this.g = arrayList;
        this.e = -1L;
        this.h = fslVar.a;
        this.i = fslVar.b;
        this.j = fslVar.d;
        this.k = fslVar.h;
        this.a = fslVar.c;
        this.b = fslVar.e;
        this.c = fslVar.f;
        this.d = fslVar.g;
        List list = fslVar.i;
        if (list != null) {
            arrayList.addAll(list);
        }
        this.e = fslVar.j;
        this.f = fslVar.k;
    }
}
