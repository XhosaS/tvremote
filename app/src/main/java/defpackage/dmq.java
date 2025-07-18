package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dmq {
    private final List a = new ArrayList();

    public final synchronized dmo a(Class cls, Class cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return dmr.a;
        }
        for (dmp dmpVar : this.a) {
            if (dmpVar.a(cls, cls2)) {
                return dmpVar.c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + String.valueOf(cls) + " to " + String.valueOf(cls2));
    }

    public final synchronized List b(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (dmp dmpVar : this.a) {
            if (dmpVar.a(cls, cls2)) {
                Class cls3 = dmpVar.b;
                if (!arrayList.contains(cls3)) {
                    arrayList.add(cls3);
                }
            }
        }
        return arrayList;
    }

    public final synchronized void c(Class cls, Class cls2, dmo dmoVar) {
        this.a.add(new dmp(cls, cls2, dmoVar));
    }
}
