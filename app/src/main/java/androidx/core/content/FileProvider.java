package androidx.core.content;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import defpackage.abt;
import defpackage.aff;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class FileProvider extends ContentProvider {
    private static final String[] a = {"_display_name", "_size"};
    private static final File b = new File("/");
    private static final HashMap c = new HashMap();
    private final Object d = new Object();
    private String e;
    private abt f;

    public static String a(String str) {
        return (str.length() <= 0 || str.charAt(str.length() + (-1)) != '/') ? str : str.substring(0, str.length() - 1);
    }

    public static abt b(Context context, String str) {
        abt abtVar;
        HashMap map = c;
        synchronized (map) {
            abtVar = (abt) map.get(str);
            if (abtVar == null) {
                try {
                    try {
                        abtVar = new abt(str);
                        ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider(str, 128);
                        if (providerInfoResolveContentProvider == null) {
                            throw new IllegalArgumentException("Couldn't find meta-data for provider with authority ".concat(String.valueOf(str)));
                        }
                        Bundle bundle = providerInfoResolveContentProvider.metaData;
                        XmlResourceParser xmlResourceParserLoadXmlMetaData = providerInfoResolveContentProvider.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
                        if (xmlResourceParserLoadXmlMetaData == null) {
                            throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
                        }
                        while (true) {
                            int next = xmlResourceParserLoadXmlMetaData.next();
                            if (next == 1) {
                                map.put(str, abtVar);
                                break;
                            }
                            if (next == 2) {
                                String name = xmlResourceParserLoadXmlMetaData.getName();
                                File externalStorageDirectory = null;
                                String attributeValue = xmlResourceParserLoadXmlMetaData.getAttributeValue(null, "name");
                                String attributeValue2 = xmlResourceParserLoadXmlMetaData.getAttributeValue(null, "path");
                                if ("root-path".equals(name)) {
                                    externalStorageDirectory = b;
                                } else if ("files-path".equals(name)) {
                                    externalStorageDirectory = context.getFilesDir();
                                } else if ("cache-path".equals(name)) {
                                    externalStorageDirectory = context.getCacheDir();
                                } else if ("external-path".equals(name)) {
                                    externalStorageDirectory = Environment.getExternalStorageDirectory();
                                } else if ("external-files-path".equals(name)) {
                                    File[] externalFilesDirs = context.getExternalFilesDirs(null);
                                    if (externalFilesDirs.length > 0) {
                                        externalStorageDirectory = externalFilesDirs[0];
                                    }
                                } else if ("external-cache-path".equals(name)) {
                                    File[] externalCacheDirs = context.getExternalCacheDirs();
                                    if (externalCacheDirs.length > 0) {
                                        externalStorageDirectory = externalCacheDirs[0];
                                    }
                                } else if ("external-media-path".equals(name)) {
                                    File[] externalMediaDirs = context.getExternalMediaDirs();
                                    if (externalMediaDirs.length > 0) {
                                        externalStorageDirectory = externalMediaDirs[0];
                                    }
                                }
                                if (externalStorageDirectory != null) {
                                    String[] strArr = {attributeValue2};
                                    for (char c2 = 0; c2 <= 0; c2 = 1) {
                                        String str2 = strArr[0];
                                        if (str2 != null) {
                                            externalStorageDirectory = new File(externalStorageDirectory, str2);
                                        }
                                    }
                                    if (TextUtils.isEmpty(attributeValue)) {
                                        throw new IllegalArgumentException("Name must not be empty");
                                    }
                                    try {
                                        abtVar.b.put(attributeValue, externalStorageDirectory.getCanonicalFile());
                                    } catch (IOException e) {
                                        Objects.toString(externalStorageDirectory);
                                        throw new IllegalArgumentException("Failed to resolve canonical path for ".concat(externalStorageDirectory.toString()), e);
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                    } catch (IOException e2) {
                        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
                    }
                } catch (XmlPullParserException e3) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e3);
                }
            }
        }
        return abtVar;
    }

    private final abt c() {
        abt abtVar;
        synchronized (this.d) {
            aff.a(this.e, "mAuthority is null. Did you override attachInfo and did not call super.attachInfo()?");
            if (this.f == null) {
                this.f = b(getContext(), this.e);
            }
            abtVar = this.f;
        }
        return abtVar;
    }

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        }
        if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        }
        if (providerInfo.authority == null || providerInfo.authority.trim().isEmpty()) {
            throw new SecurityException("Provider must have a non-empty authority");
        }
        String str = providerInfo.authority.split(";")[0];
        synchronized (this.d) {
            this.e = str;
        }
        HashMap map = c;
        synchronized (map) {
            map.remove(str);
        }
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return c().a(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) throws IOException {
        File fileA = c().a(uri);
        int iLastIndexOf = fileA.getName().lastIndexOf(46);
        if (iLastIndexOf < 0) {
            return "application/octet-stream";
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileA.getName().substring(iLastIndexOf + 1));
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public final String getTypeAnonymous(Uri uri) {
        return "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) throws IOException {
        int i;
        File fileA = c().a(uri);
        if ("r".equals(str)) {
            i = 268435456;
        } else if ("w".equals(str) || "wt".equals(str)) {
            i = 738197504;
        } else if ("wa".equals(str)) {
            i = 704643072;
        } else if ("rw".equals(str)) {
            i = 939524096;
        } else {
            if (!"rwt".equals(str)) {
                throw new IllegalArgumentException("Invalid mode: ".concat(String.valueOf(str)));
            }
            i = 1006632960;
        }
        return ParcelFileDescriptor.open(fileA, i);
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) throws IOException {
        int i;
        File fileA = c().a(uri);
        String queryParameter = uri.getQueryParameter("displayName");
        if (strArr == null) {
            strArr = a;
        }
        int length = strArr.length;
        String[] strArr3 = new String[length];
        Object[] objArr = new Object[length];
        int i2 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                i = i2 + 1;
                strArr3[i2] = "_display_name";
                objArr[i2] = queryParameter == null ? fileA.getName() : queryParameter;
            } else if ("_size".equals(str3)) {
                i = i2 + 1;
                strArr3[i2] = "_size";
                objArr[i2] = Long.valueOf(fileA.length());
            }
            i2 = i;
        }
        String[] strArr4 = new String[i2];
        System.arraycopy(strArr3, 0, strArr4, 0, i2);
        Object[] objArr2 = new Object[i2];
        System.arraycopy(objArr, 0, objArr2, 0, i2);
        MatrixCursor matrixCursor = new MatrixCursor(strArr4, 1);
        matrixCursor.addRow(objArr2);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }
}
