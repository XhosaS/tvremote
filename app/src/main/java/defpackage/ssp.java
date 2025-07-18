package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ssp {
    private static final zdy a = zdy.h("com/google/android/libraries/search/audio/microphone/source/registry/HotwordSourceDataRegistry");
    private final List b;

    public ssp(spf spfVar, Executor executor, ahbt ahbtVar, smw smwVar, zwv zwvVar, eud eudVar) {
        spfVar.getClass();
        executor.getClass();
        ahbtVar.getClass();
        smwVar.getClass();
        zwvVar.getClass();
        eudVar.getClass();
        this.b = new ArrayList();
    }

    public final synchronized List a() {
        ArrayList arrayList;
        List list = this.b;
        arrayList = new ArrayList(agqq.i(list, 10));
        Iterator it = list.iterator();
        if (it.hasNext()) {
            throw null;
        }
        return arrayList;
    }
}
