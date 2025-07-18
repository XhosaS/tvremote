package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
final class zam implements Iterator {
    public static final zam a;
    private static final /* synthetic */ zam[] b;

    static {
        zam zamVar = new zam();
        a = zamVar;
        b = new zam[]{zamVar};
    }

    private zam() {
    }

    public static zam[] values() {
        return (zam[]) b.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        yqw.M(false, "no calls to next() since the last call to remove()");
    }
}
