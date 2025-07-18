package defpackage;

import java.io.File;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class syx implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return agsm.a(Long.valueOf(((File) obj).lastModified()), Long.valueOf(((File) obj2).lastModified()));
    }
}
