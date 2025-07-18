package defpackage;

import java.io.File;
import java.io.FilenameFilter;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class lzf implements FilenameFilter {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ lzf(String str, int i) {
        this.b = i;
        this.a = str;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return this.b != 0 ? str.endsWith(String.valueOf(((lfb) this.a).b).concat(".cache")) : str.startsWith((String) this.a);
    }

    public lzf(lfb lfbVar, int i) {
        this.b = i;
        this.a = lfbVar;
    }
}
