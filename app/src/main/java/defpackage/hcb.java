package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Picture;
import android.view.View;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hcb implements hcc {
    private static final zdy b = zdy.h("com/google/android/apps/tvsearch/previewer/PreviewerHelperImpl");
    public final agte a;
    private final Context c;
    private final ahbt d;

    public hcb(Context context, agte agteVar, ahbt ahbtVar) {
        context.getClass();
        agteVar.getClass();
        ahbtVar.getClass();
        this.c = context;
        this.a = agteVar;
        this.d = ahbtVar;
    }

    @Override // defpackage.hcc
    public final Picture a(View view) {
        view.getClass();
        Picture picture = new Picture();
        ((zdv) b.d().q("com/google/android/apps/tvsearch/previewer/PreviewerHelperImpl", "getPictureFromView", 46, "PreviewerHelperImpl.kt")).K("visibility=%s, width=%s, height=%s, measuredWidth=%s, measuredHeight=%s", Integer.valueOf(view.getVisibility()), Integer.valueOf(view.getWidth()), Integer.valueOf(view.getHeight()), Integer.valueOf(view.getMeasuredWidth()), Integer.valueOf(view.getMeasuredHeight()));
        Canvas canvasBeginRecording = picture.beginRecording(view.getWidth(), view.getHeight());
        canvasBeginRecording.getClass();
        view.draw(canvasBeginRecording);
        picture.endRecording();
        return picture;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
    
        if (r2 != false) goto L17;
     */
    @Override // defpackage.hcc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.xhr b(java.lang.String r5) throws defpackage.abxv {
        /*
            r4 = this;
            java.io.File r0 = new java.io.File
            android.content.Context r1 = r4.c
            java.io.File r1 = r1.getFilesDir()
            r0.<init>(r1, r5)
            byte[] r5 = defpackage.zks.a(r0)
            xhr r0 = defpackage.xhr.a
            int r1 = r5.length
            com.google.protobuf.ExtensionRegistryLite r2 = com.google.protobuf.ExtensionRegistryLite.a
            abza r2 = defpackage.abza.a
            com.google.protobuf.ExtensionRegistryLite r2 = com.google.protobuf.ExtensionRegistryLite.a
            r3 = 0
            abxd r5 = defpackage.abxd.h(r0, r5, r3, r1, r2)
            if (r5 == 0) goto L53
            r0 = 1
            r1 = 0
            java.lang.Object r2 = r5.cM(r0, r1)
            java.lang.Byte r2 = (java.lang.Byte) r2
            byte r2 = r2.byteValue()
            if (r2 != r0) goto L2e
            goto L53
        L2e:
            if (r2 == 0) goto L49
            abza r2 = defpackage.abza.a
            java.lang.Class r3 = r5.getClass()
            abzj r2 = r2.a(r3)
            boolean r2 = r2.l(r5)
            if (r0 == r2) goto L41
            goto L42
        L41:
            r1 = r5
        L42:
            r0 = 2
            r5.cM(r0, r1)
            if (r2 == 0) goto L49
            goto L53
        L49:
            abzz r5 = new abzz
            r5.<init>()
            abxv r5 = r5.a()
            throw r5
        L53:
            xhr r5 = (defpackage.xhr) r5
            r5.getClass()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hcb.b(java.lang.String):xhr");
    }

    @Override // defpackage.hcc
    public final zyd c(Picture picture, File file, String str) {
        return ahkr.c(this.d, 0, new hca(this, picture, file, str, null), 3);
    }

    @Override // defpackage.hcc
    public final void d(hcd hcdVar, File file, String str) {
        String str2;
        Object objA;
        hcdVar.getClass();
        int iOrdinal = hcdVar.ordinal();
        if (iOrdinal == 0) {
            ((zdv) b.d().q("com/google/android/apps/tvsearch/previewer/PreviewerHelperImpl", "writeEmptyFile", 72, "PreviewerHelperImpl.kt")).u("Writing an empty .png file.");
            str2 = ".png";
        } else {
            if (iOrdinal != 1) {
                throw new agpg();
            }
            str2 = ".screenshot";
        }
        try {
            objA = Boolean.valueOf(new File(file, str.concat(str2)).createNewFile());
        } catch (Throwable th) {
            objA = agpl.a(th);
        }
        if (agpk.b(objA)) {
            ((Boolean) objA).booleanValue();
            ((zdv) b.b().q("com/google/android/apps/tvsearch/previewer/PreviewerHelperImpl", "writeEmptyFile", 77, "PreviewerHelperImpl.kt")).x("%s file was created.", hcdVar);
        }
        Throwable thA = agpk.a(objA);
        if (thA != null) {
            ((zdv) ((zdv) b.c()).p(thA).q("com/google/android/apps/tvsearch/previewer/PreviewerHelperImpl", "writeEmptyFile", 78, "PreviewerHelperImpl.kt")).x("%s file was NOT created.", hcdVar);
        }
    }
}
