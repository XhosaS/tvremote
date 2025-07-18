package defpackage;

import java.util.Enumeration;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ddr implements Enumeration {
    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        return false;
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        throw new NoSuchElementException("Empty Enumeration");
    }
}
