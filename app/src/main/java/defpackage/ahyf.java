package defpackage;

import j$.nio.channels.DesugarChannels;
import java.io.File;
import java.io.FileInputStream;
import java.nio.channels.FileChannel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ahyf implements ahyi {
    final /* synthetic */ File a;

    public ahyf(File file) {
        this.a = file;
    }

    @Override // defpackage.ahyi
    public final FileChannel a() {
        return DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(new FileInputStream(this.a).getChannel());
    }
}
