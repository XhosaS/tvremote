package defpackage;

import com.google.common.collect.ForwardingListMultimap;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.LinkedListMultimap;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.Multimap;
import j$.net.URLDecoder;
import java.io.IOException;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ueg extends ForwardingListMultimap implements Cloneable, Serializable {
    public static final ueg a = new ueg(ImmutableListMultimap.of());
    private static final long serialVersionUID = -3053773769157973706L;
    public final ListMultimap b;

    public ueg() {
        this(LinkedListMultimap.create());
    }

    public static String a(String str, int i, int i2, Charset charset, boolean z) {
        try {
            return z ? new String(URLDecoder.decode(str.substring(i, i2), "ISO-8859-1").getBytes(StandardCharsets.ISO_8859_1), charset) : URLDecoder.decode(str.substring(i, i2), charset.name());
        } catch (UnsupportedEncodingException unused) {
            return str.substring(i, i2);
        } catch (IllegalArgumentException unused2) {
            return str.substring(i, i2);
        }
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return new ueg(LinkedListMultimap.create(this.b));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingListMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.ForwardingObject
    public final ListMultimap<String, String> delegate() {
        return this.b;
    }

    @Override // com.google.common.collect.ForwardingObject
    public final String toString() throws IOException {
        Charset charset = uef.a;
        charset.getClass();
        StringBuilder sb = new StringBuilder();
        try {
            Iterator it = entries().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                sb.append((CharSequence) uef.a((String) entry.getKey(), charset));
                if (!((String) entry.getValue()).isEmpty()) {
                    sb.append('=').append(uef.a((String) entry.getValue(), charset));
                }
                if (it.hasNext()) {
                    sb.append('&');
                }
            }
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public ueg(ListMultimap listMultimap) {
        this.b = new udz(listMultimap);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingListMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.ForwardingObject
    public final /* synthetic */ Multimap delegate() {
        return this.b;
    }

    @Override // com.google.common.collect.ForwardingListMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.ForwardingObject
    protected final /* synthetic */ Object delegate() {
        return this.b;
    }
}
