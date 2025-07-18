package defpackage;

import android.os.Process;
import j$.time.Duration;
import java.io.IOException;
import java.nio.channels.ReadableByteChannel;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class aaal implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public aaal(aaas aaasVar, int i, char[] cArr) {
        this.b = i;
        this.a = aaasVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws NumberFormatException {
        Map<String, List<String>> allHeaders;
        String str;
        int i;
        long length;
        int i2;
        long j;
        int i3;
        int i4;
        int i5 = this.b;
        int i6 = 1;
        if (i5 == 0) {
            ((aaas) this.a).w++;
            return;
        }
        if (i5 == 1) {
            aaas aaasVar = (aaas) this.a;
            ReadableByteChannel readableByteChannel = aaasVar.n;
            if (readableByteChannel != null) {
                try {
                    readableByteChannel.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                aaasVar.n = null;
                return;
            }
            return;
        }
        if (i5 == 2) {
            aaas aaasVar2 = (aaas) this.a;
            aaasVar2.m = aaasVar2.p;
            aaasVar2.p = null;
            aaasVar2.h();
            return;
        }
        if (i5 != 3) {
            ((aaar) this.a).a();
            return;
        }
        Object obj = this.a;
        try {
            aaas aaasVar3 = ((aaaq) obj).d;
            zzy zzyVar = aaasVar3.t;
            long j2 = aaasVar3.s;
            aaba aabaVar = aaasVar3.o;
            if (aabaVar != null) {
                allHeaders = aabaVar.getAllHeaders();
                aaba aabaVar2 = aaasVar3.o;
                str = aabaVar2.b;
                i = aabaVar2.a;
            } else {
                allHeaders = Collections.EMPTY_MAP;
                str = "";
                i = 0;
            }
            String str2 = str;
            long length2 = 0;
            for (Map.Entry entry : aaasVar3.e.entrySet()) {
                if (((String) entry.getKey()) != null) {
                    i4 = i6;
                    length2 += r17.length();
                } else {
                    i4 = i6;
                }
                if (((String) entry.getValue()) != null) {
                    length2 += r3.length();
                }
                i6 = i4;
            }
            int i7 = i6;
            if (allHeaders == null) {
                length = 0;
            } else {
                length = 0;
                for (Map.Entry<String, List<String>> entry2 : allHeaders.entrySet()) {
                    if (entry2.getKey() != null) {
                        length += r12.length();
                    }
                    if (entry2.getValue() != null) {
                        Iterator<String> it = entry2.getValue().iterator();
                        while (it.hasNext()) {
                            if (it.next() != null) {
                                length += r11.length();
                            }
                        }
                    }
                }
            }
            if (allHeaders.containsKey("Content-Length")) {
                i2 = 0;
                try {
                    j = Long.parseLong(allHeaders.get("Content-Length").get(0));
                } catch (NumberFormatException unused) {
                    j = 0;
                }
            } else {
                i2 = 0;
                j = -1;
            }
            Duration durationOfSeconds = Duration.ofSeconds(0L);
            Duration durationOfSeconds2 = Duration.ofSeconds(0L);
            aaas aaasVar4 = ((aaaq) obj).d;
            int i8 = aaasVar4.g.get();
            if (i8 == 6) {
                i3 = 2;
            } else if (i8 == 7) {
                i3 = i7;
            } else {
                if (i8 != 8) {
                    throw new IllegalStateException(a.cd(i8, "Internal Cronet error: attempted to report metrics but current state (", ") is not a done state!"));
                }
                i3 = 3;
            }
            int i9 = aaasVar4.w;
            int i10 = aaasVar4.v;
            aaai aaaiVar = aaasVar4.y;
            if (aaaiVar != null) {
                i2 = aaaiVar.g;
            }
            zzyVar.d(j2, new zzw(length2, length, j, i, durationOfSeconds, durationOfSeconds2, str2, i3, i9, i10, i2, aaasVar4.x, Process.myUid(), zzv.CRONET_SOURCE_FALLBACK));
        } catch (RuntimeException unused2) {
            String str3 = aaas.a;
        }
    }

    public /* synthetic */ aaal(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
