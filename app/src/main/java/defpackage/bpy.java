package defpackage;

import java.util.Comparator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpy implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return agsm.a((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
    }
}
