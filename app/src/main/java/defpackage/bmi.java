package defpackage;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bmi {
    public final Context a;
    public final String b;
    public Executor d;
    public brq e;
    public boolean f;
    public Intent g;
    public boolean i;
    public boolean j;
    private final agxd k;
    private Executor m;
    public final List c = new ArrayList();
    private final List l = new ArrayList();
    private final bmk n = new bmk();
    private final Set o = new LinkedHashSet();
    private final Set p = new LinkedHashSet();
    private final List q = new ArrayList();
    public boolean h = true;

    public bmi(Context context, Class cls, String str) {
        agwj agwjVar = agwi.a;
        this.k = new agvq(cls);
        this.a = context;
        this.b = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0170, code lost:
    
        throw new java.lang.IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.bmn a() {
        /*
            Method dump skipped, instructions count: 825
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bmi.a():bmn");
    }

    public final void b(boy... boyVarArr) {
        boy boyVar = boyVarArr[0];
        Integer numValueOf = Integer.valueOf(boyVar.a);
        Set set = this.p;
        set.add(numValueOf);
        set.add(Integer.valueOf(boyVar.b));
        boy[] boyVarArr2 = (boy[]) Arrays.copyOf(boyVarArr, 1);
        boyVarArr2.getClass();
        for (boy boyVar2 : boyVarArr2) {
            this.n.a(boyVar2);
        }
    }
}
