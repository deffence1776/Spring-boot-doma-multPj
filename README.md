Spring-boot-doma-multPj
=======================

Spring boot  Example Project. Using Doma2 as ORM.

==
projects 
==
 domain:ドメイン層。WebやDBに依存しない。他のプロジェクトに依存しない。他のプロジェクトは常にドメイン層に依存する。<br/>
 persistence:永続化層。Doma2を使う。ドメイン層のRepositoryの実装を提供するのもここ。<br/>
 web:Web層。永続化層への依存も排除しようとも思ったけど、そこまでは。。。<br/>
