package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uen {
    private final Context a;
    private final uey b;

    public uen(Context context, uey ueyVar) {
        this.a = context;
        this.b = ueyVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final File a(Uri uri) {
        File externalFilesDir;
        if (!uri.getScheme().equals("android")) {
            throw new ufu("Scheme must be 'android'");
        }
        if (uri.getPathSegments().isEmpty()) {
            throw new ufu(String.format("Path must start with a valid logical location: %s", uri));
        }
        if (!TextUtils.isEmpty(uri.getQuery())) {
            throw new ufu("Did not expect uri to have query");
        }
        ArrayList arrayList = new ArrayList(uri.getPathSegments());
        String str = (String) arrayList.get(0);
        switch (str.hashCode()) {
            case -1820761141:
                if (str.equals("external")) {
                    externalFilesDir = this.a.getExternalFilesDir(null);
                    return new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                }
                throw new ufu(String.format("Path must start with a valid logical location: %s", uri));
            case 94416770:
                if (str.equals("cache")) {
                    externalFilesDir = this.a.getCacheDir();
                    return new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                }
                throw new ufu(String.format("Path must start with a valid logical location: %s", uri));
            case 97434231:
                if (str.equals("files")) {
                    externalFilesDir = uek.b(this.a);
                    return new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                }
                throw new ufu(String.format("Path must start with a valid logical location: %s", uri));
            case 835260319:
                if (str.equals("managed")) {
                    File file = new File(uek.b(this.a), "managed");
                    if (arrayList.size() >= 3) {
                        try {
                            Account accountA = ueh.a((String) arrayList.get(2));
                            if (!ueh.a.equals(accountA)) {
                                uey ueyVar = this.b;
                                if (ueyVar == null) {
                                    throw new ufu("AccountManager cannot be null");
                                }
                                try {
                                    arrayList.set(2, Integer.toString(((Integer) ((zuv) ueyVar.b(accountA)).s()).intValue()));
                                } catch (InterruptedException e) {
                                    Thread.currentThread().interrupt();
                                    throw new ufu(e);
                                } catch (ExecutionException e2) {
                                    throw new ufu(e2.getCause());
                                }
                            }
                        } catch (IllegalArgumentException e3) {
                            throw new ufu(e3);
                        }
                    }
                    externalFilesDir = file;
                    return new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                }
                throw new ufu(String.format("Path must start with a valid logical location: %s", uri));
            case 988548496:
                if (str.equals("directboot-cache")) {
                    externalFilesDir = this.a.createDeviceProtectedStorageContext().getCacheDir();
                    return new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                }
                throw new ufu(String.format("Path must start with a valid logical location: %s", uri));
            case 991565957:
                if (str.equals("directboot-files")) {
                    externalFilesDir = this.a.createDeviceProtectedStorageContext().getFilesDir();
                    return new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                }
                throw new ufu(String.format("Path must start with a valid logical location: %s", uri));
            default:
                throw new ufu(String.format("Path must start with a valid logical location: %s", uri));
        }
    }
}
