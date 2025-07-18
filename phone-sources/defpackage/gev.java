package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gev {
    public Executor b;
    public Executor c;
    public ghn d;
    public boolean g;
    public boolean h;
    public yil i;
    private final ymh j;
    private final Context k;
    private final String l;
    private boolean n;
    public final List a = new ArrayList();
    private final List m = new ArrayList();
    private final cb q = new cb((char[]) null, (byte[]) null);
    public final Set e = new LinkedHashSet();
    private final Set o = new LinkedHashSet();
    private final List p = new ArrayList();
    public boolean f = true;

    public gev(Context context, Class cls, String str) {
        this.j = wef.q(cls);
        this.k = context;
        this.l = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0174, code lost:
    
        throw new java.lang.IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
     */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.gex a() {
        /*
            Method dump skipped, instructions count: 918
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gev.a():gex");
    }

    public final void b(ggi... ggiVarArr) {
        int length;
        ggiVarArr.getClass();
        int i = 0;
        while (true) {
            length = ggiVarArr.length;
            if (i >= length) {
                break;
            }
            ggi ggiVar = ggiVarArr[i];
            Set set = this.o;
            set.add(Integer.valueOf(ggiVar.a));
            set.add(Integer.valueOf(ggiVar.b));
            i++;
        }
        cb cbVar = this.q;
        ggi[] ggiVarArr2 = (ggi[]) Arrays.copyOf(ggiVarArr, length);
        ggiVarArr2.getClass();
        for (ggi ggiVar2 : ggiVarArr2) {
            cbVar.r(ggiVar2);
        }
    }

    public final void c() {
        this.n = true;
    }

    public final void d() {
        this.f = true;
        this.g = true;
        this.h = false;
    }

    public final void e(yil yilVar) {
        if (this.b != null || this.c != null) {
            throw new IllegalArgumentException("This builder has already been configured with an Executor. A RoomDatabase canonly be configured with either an Executor or a CoroutineContext.");
        }
        if (yilVar.get(yii.k) == null) {
            throw new IllegalArgumentException("It is required that the coroutine context contain a dispatcher.");
        }
        this.i = yilVar;
    }
}
