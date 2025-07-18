package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uee implements Comparable, Serializable {
    private static final long serialVersionUID = -1105194233979842380L;
    public final String a;
    public transient Charset b;
    public volatile transient ueg c;
    volatile transient String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;

    public uee(String str, String str2, String str3, String str4, String str5, Charset charset, String str6) {
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.a = str4;
        this.h = str5;
        this.b = charset;
        this.d = str6;
    }

    public static String a(String str) {
        if (str == null) {
            return null;
        }
        return str.toLowerCase(Locale.ENGLISH);
    }

    private static String b(String str, String str2) {
        return str != null ? str2 : "";
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Object object = objectInputStream.readObject();
        object.getClass();
        this.b = Charset.forName((String) object);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.b.name());
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        uee ueeVar = (uee) obj;
        ueeVar.getClass();
        return toString().compareTo(ueeVar.toString());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uee) {
            return toString().equals(obj.toString());
        }
        return false;
    }

    public final int hashCode() {
        return toString().hashCode();
    }

    public final String toString() {
        if (this.d != null) {
            return this.d;
        }
        String str = this.e;
        String str2 = this.f;
        String str3 = this.g;
        String str4 = this.a;
        String str5 = this.h;
        String str6 = sij.E(str) + b(str, ":") + b(str2, "//") + sij.E(str2) + sij.E(str3) + b(str4, "?") + sij.E(str4) + b(str5, "#") + sij.E(str5);
        this.d = str6;
        return str6;
    }

    public uee(String str, String str2, String str3, String str4, String str5, Charset charset) {
        this.e = a(str);
        this.f = str2;
        this.g = str3;
        this.a = str4;
        this.h = str5;
        this.b = charset;
    }
}
