package defpackage;

import android.content.Context;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aeg implements Callable {
    final /* synthetic */ String a;
    final /* synthetic */ Context b;
    final /* synthetic */ aee c;
    final /* synthetic */ int d;

    public aeg(String str, Context context, aee aeeVar, int i) {
        this.a = str;
        this.b = context;
        this.c = aeeVar;
        this.d = i;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        Object[] objArr = {this.c};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        obj.getClass();
        arrayList.add(obj);
        return ael.a(this.a, this.b, DesugarCollections.unmodifiableList(arrayList), this.d);
    }
}
