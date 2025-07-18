package j$.nio.file;

import java.nio.file.WatchEvent;

/* loaded from: classes4.dex */
public final /* synthetic */ class C implements WatchEvent.Kind {
    public final /* synthetic */ D a;

    public final /* synthetic */ boolean equals(Object obj) {
        D d = this.a;
        if (obj instanceof C) {
            obj = ((C) obj).a;
        }
        return d.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.WatchEvent.Kind
    public final /* synthetic */ String name() {
        return this.a.name();
    }

    @Override // java.nio.file.WatchEvent.Kind
    public final /* synthetic */ Class type() {
        return this.a.type();
    }
}
