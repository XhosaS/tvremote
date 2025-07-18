package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uof extends uog {
    public final MessageLite a;
    private final ExtensionRegistryLite b;

    public uof(MessageLite messageLite, ExtensionRegistryLite extensionRegistryLite) {
        this.a = messageLite;
        if (extensionRegistryLite == null) {
            throw new NullPointerException("Null extensionRegistryLite");
        }
        this.b = extensionRegistryLite;
    }

    @Override // defpackage.uog
    public final ExtensionRegistryLite a() {
        return this.b;
    }

    @Override // defpackage.uog
    public final MessageLite b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uog) {
            uog uogVar = (uog) obj;
            if (this.a.equals(uogVar.b()) && this.b.equals(uogVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        ExtensionRegistryLite extensionRegistryLite = this.b;
        return "ProtoSerializer{defaultValue=" + this.a.toString() + ", extensionRegistryLite=" + extensionRegistryLite.toString() + "}";
    }
}
