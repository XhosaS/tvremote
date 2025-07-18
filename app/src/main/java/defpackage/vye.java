package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vye extends RuntimeException {
    public vye() {
        super("Infinite fetch cycle detected. This occurs when a fetch does not produce a cache hit on the next load from local storage.");
    }
}
